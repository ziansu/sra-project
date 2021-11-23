@java.lang.Override
public int hashCode() {
    return ((currentCity.hashCode()) + ((carriedTasks) == null ? 0 : carriedTasks.hashCode())) + ((remainingTasks) == null ? 0 : remainingTasks.hashCode());
}