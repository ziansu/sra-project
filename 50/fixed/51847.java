@com.funliving.info.resource.PUT
@com.funliving.info.resource.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
@com.funliving.info.resource.Produces(value = "text/plain")
public int create(@com.funliving.info.resource.BeanParam
com.funliving.info.repository.entity.Schedule schedule) {
    scheduleRepository.create(schedule);
    return schedule.getId();
}