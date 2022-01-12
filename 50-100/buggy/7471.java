private java.lang.String loadShader(java.lang.String name) {
    cub3d.file.main.FileAPI api = new cub3d.file.main.FileAPI(name);
    java.lang.String s = "";
    try {
        cub3d.file.reader.BasicReader br = new cub3d.file.reader.BasicReader(api.getReader());
        java.lang.String line;
        while ((line = br.readLine()) != null)
            s += line;
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return s;
}