@java.lang.Override
public java.lang.Object get(org.hawk.core.model.IHawkAttribute attr) {
    java.lang.String name = attr.getName();
    switch (name) {
        case "name" :
            return name != null;
        default :
            return null;
    }
}