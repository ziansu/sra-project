private boolean validateNewSong(java.lang.String title, java.lang.String bpmString) {
    if ((title == null) || (title.equals(""))) {
        return false;
    }else
        if (((bpmString == null) || (bpmString.equals(""))) || ((java.lang.Integer.parseInt(bpmString)) <= 0)) {
            return false;
        }else {
            return true;
        }
    
}