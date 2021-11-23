private void makeNewHeader(org.json.JSONObject transforms) {
    for (int x = 1; x < ((transforms.length()) + 1); x++) {
        java.lang.String curTransform = "transform" + x;
        java.lang.String newField = getCurrTransformNewField(transforms, curTransform);
        java.lang.System.out.println(("newField is: " + newField));
        if (newField.equals("")) {
        }else
            if (checkHeaderDuplicate(newHeader, newField)) {
                newHeader.put(newHeader.length(), newField);
            }
        
    }
}