@org.springframework.web.bind.annotation.InitBinder
public void initBinder(org.springframework.web.bind.WebDataBinder binder) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(java.sql.Date.class, new org.springframework.beans.propertyeditors.CustomDateEditor(dateFormat, false));
}