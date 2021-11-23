@javax.jws.WebMethod
@javax.jws.WebResult(name = "autoProcProgramId")
public java.lang.Integer storeOrUpdateAutoProcProgram(java.lang.Integer autoProcProgramId, @javax.jws.WebParam(name = "processingCommandLine")
java.lang.String processingCommandLine, @javax.jws.WebParam(name = "processingPrograms")
java.lang.String processingPrograms, @javax.jws.WebParam(name = "processingStatus")
java.lang.Boolean processingStatus, @javax.jws.WebParam(name = "processingMessage")
java.lang.String processingMessage, @javax.jws.WebParam(name = "processingStartTime")
java.util.Date processingStartTime, @javax.jws.WebParam(name = "processingEndTime")
java.util.Date processingEndTime, @javax.jws.WebParam(name = "processingEnvironment")
java.lang.String processingEnvironment, @javax.jws.WebParam(name = "recordTimeStamp")
java.util.Date recordTimeStamp) throws java.lang.Exception {
    ispyb.server.mx.vos.autoproc.AutoProcProgram3VO vo = new ispyb.server.mx.vos.autoproc.AutoProcProgram3VO(autoProcProgramId, processingCommandLine, processingPrograms, processingStatus, processingMessage, processingStartTime, processingEndTime, processingEnvironment, recordTimeStamp);
    return storeOrUpdateAutoProcProgramValue(vo);
}