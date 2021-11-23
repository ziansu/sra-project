private java.util.HashMap<java.lang.String, java.lang.String> getRObjects() {
    org.rosuda.REngine.Rserve.RConnection connection = null;
    java.util.HashMap<java.lang.String, java.lang.String> rObjects = null;
    try {
        connection = de.mpicbg.knime.scripting.r.RUtils.createConnection();
        de.mpicbg.knime.scripting.r.RUtils.loadWorkspace(m_WorkspaceFile, connection);
        rObjects = getRObjects(connection);
    } catch (de.mpicbg.knime.scripting.core.exceptions.KnimeScriptingException e) {
        e.printStackTrace();
    }
    if (connection != null)
        connection.close();
    
    return rObjects;
}