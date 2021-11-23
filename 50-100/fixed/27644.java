@java.lang.Override
public com.louie.authcode.file.model.AuthcodeFile peekFile() {
    com.louie.authcode.file.model.AuthcodeFile file = new com.louie.authcode.file.model.AuthcodeFile();
    java.io.File[] files = new java.io.File(((com.louie.authcode.engine.config.EngineParameters.PROJECT_ROOT) + "/waitTraining")).listFiles();
    if ((files != null) && ((files.length) > 0)) {
        file.setFile(files[0]);
    }else {
        file = null;
    }
    return file;
}