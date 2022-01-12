@java.lang.Override
public int compare(org.eclipse.emf.ecore.EClass first, org.eclipse.emf.ecore.EClass second) {
    if (((first != null) && (second != null)) && ((first.getName()) != null)) {
        return first.getName().compareTo(second.getName());
    }else {
        return 0;
    }
}