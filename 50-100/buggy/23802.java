@com.scut.vsp.controller.RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<com.scut.vsp.response.model.Success> deleteProgram(@com.scut.vsp.controller.PathVariable
java.lang.String id) {
    long delNum = programMapper.deleteByProgramId(id);
    boolean flag = (delNum == 0) ? false : true;
    org.springframework.http.HttpStatus status = (delNum == 0) ? org.springframework.http.HttpStatus.BAD_REQUEST : org.springframework.http.HttpStatus.OK;
    com.scut.vsp.response.model.Success res = new com.scut.vsp.response.model.Success(flag);
    return new org.springframework.http.ResponseEntity(res, status);
}