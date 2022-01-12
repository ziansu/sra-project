public static java.lang.Class getTypeOf(com.google.gson.JsonObject object) {
    if (object.has("digest")) {
        return org.tndata.officehours.model.Message.class;
    }else
        if (object.has("avatar")) {
            return org.tndata.officehours.model.Person.class;
        }else
            if ((object.has("from")) && (object.has("to"))) {
                return OfficeHours.TimeSlot.class;
            }
        
    
    return org.tndata.officehours.model.Course.class;
}