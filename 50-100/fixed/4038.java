@tasker.controller.RequestMapping(value = "/space", method = RequestMethod.POST)
public tasker.model.Space createSpace(@tasker.controller.RequestBody
tasker.model.Space requestSpace) {
    tasker.model.Space space = new tasker.model.Space();
    org.springframework.beans.BeanUtils.copyProperties(requestSpace, space);
    java.lang.Long requestTeamID = requestSpace.getTeam().getId();
    tasker.model.Team team = teamRepository.findOne(requestTeamID);
    space.setTeam(team);
    if (team == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException("Team not found");
    }
    spaceRepository.save(space);
    return space;
}