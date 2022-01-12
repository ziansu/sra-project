public java.lang.String searchPatient() {
    javax.servlet.http.HttpServletRequest request = org.apache.struts2.ServletActionContext.getRequest();
    com.smict.person.data.PatientData patData = new com.smict.person.data.PatientData();
    this.patList = patData.searchPatient(patModel);
    java.lang.System.out.println(this.patList.size());
    if ((this.patList.size()) > 0) {
        request.setAttribute("alertMSG", "ไม่พบข้อมูลคนไข้");
    }else {
        request.setAttribute("alertMSG", null);
    }
    return SUCCESS;
}