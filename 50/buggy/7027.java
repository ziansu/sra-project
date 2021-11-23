@java.lang.Override
public boolean apply(fr.istic.iodeman.model.Priority p) {
    return p.getWeight().equals(priority.getWeight());
}