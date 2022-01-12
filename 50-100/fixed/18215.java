private java.lang.String getTypeValue(int id) {
    if (id == (rbTraditional.getId())) {
        return rbTraditional.getText().toString();
    }else
        if (id == (rbMulti.getId())) {
            return rbMulti.getText().toString();
        }else
            if (id == (rbMystery.getId())) {
                return "Unknown Cache";
            }else {
                return "Unknown Cache";
            }
        
    
}