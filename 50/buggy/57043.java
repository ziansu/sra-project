@java.lang.Override
public void onStart(Application app) {
    popActors(1);
    if ((MovieUser.find.findRowCount()) == 0) {
        com.avaje.ebean.Ebean.save(((java.util.List) (Yaml.load("test-user.yml"))));
    }
}