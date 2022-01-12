@javax.annotation.PostConstruct
public void init() {
    if ((ds) == null)
        ds = new isti.cnr.sse.rest.data.FactoryLocal();
    
    prove = new java.util.ArrayList<>();
}