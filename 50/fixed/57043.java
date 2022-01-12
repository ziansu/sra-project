@java.lang.Override
public void onStart(Application app) {
    if ((MovieUser.find.findRowCount()) == 0) {
        com.avaje.ebean.Ebean.save(((java.util.List) (Yaml.load("test-user.yml"))));
    }
}