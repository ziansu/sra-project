@java.lang.Override
public void addRoute(edu.hm.cs.bikebattle.app.modell.Route route, edu.hm.cs.bikebattle.app.modell.User user, edu.hm.cs.bikebattle.app.data.Consumer consumer) {
    edu.hm.cs.bikebattle.app.api.domain.RouteDto routeDto = edu.hm.cs.bikebattle.app.modell.assembler.RouteAssembler.toDto(route);
    routeDto.setOwner(((address) + (user.getOid())));
    executeWriteCall(routeClient.create(routeDto), consumer);
}