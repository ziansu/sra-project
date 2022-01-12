public java.lang.String getYearCode() {
    if (org.springframework.util.StringUtils.isEmpty(this.getYear())) {
        return "";
    }else
        if ((this.getYear().length()) == 2) {
            return this.getYear();
        }else
            if ((this.getYear().length()) == 4) {
                return this.getYear().substring(((this.getYear().length()) - 2));
            }
        
    
    return "??";
}