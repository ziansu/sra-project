@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response save(@javax.validation.Valid
com.excilys.computerdatabase.binding.dto.model.ComputerDTO computer) {
    com.excilys.computerdatabase.restservice.ComputerRS.LOGGER.info("Saved computer {}", computer);
    computerDTOMapper = new com.excilys.computerdatabase.binding.dto.impl.ComputerDTOMapperImpl();
    computerDBService.save(computerDTOMapper.mapFromDTO(computer));
    return javax.ws.rs.core.Response.status(201).entity(computer).build();
}