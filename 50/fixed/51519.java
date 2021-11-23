@java.lang.Override
public int hashCode() {
    return ((currentCity.hashCode()) + (carriedTasks.hashCode())) + (remainingTasks.hashCode());
}