public void process() {
    result = new java.util.ArrayList<>();
    int key = getKey();
    if (key == (-1)) {
        com.tomer.Utils.toast(javax.faces.context.FacesContext.getCurrentInstance(), "Key Not Found!");
        java.lang.System.out.println("Invalid key entered");
        this.finalFileName = "Please make sure that your input was correctly entered";
        return ;
    }
    result = new java.util.ArrayList<>();
    setTextFromFile(result, this.filePath, key);
    if ((result.size()) <= 0)
        return ;
    
    super.process();
}