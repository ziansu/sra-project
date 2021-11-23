@java.lang.Override
public boolean hasNext() {
    return (current) < (response.getResults().getNumFound());
}