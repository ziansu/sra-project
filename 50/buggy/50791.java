@javax.annotation.PostConstruct
public void init() {
    try {
        initialData = new com.qa.smurf.InitialData();
    } catch (java.text.ParseException pe) {
        pe.printStackTrace();
    }
}