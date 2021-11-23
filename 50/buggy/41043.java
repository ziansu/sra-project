@javax.annotation.PostConstruct
public void init() {
    ds = new isti.cnr.sse.rest.data.FactoryLocal();
    prove = new java.util.ArrayList<>();
}