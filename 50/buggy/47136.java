@java.lang.Override
public int hashCode() {
    return ((int) ((forkJoinCPIndex) ^ ((forkJoinCPIndex) >>> 32)));
}