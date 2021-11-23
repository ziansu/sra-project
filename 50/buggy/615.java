@java.lang.Override
public boolean isActive() {
    return ((!(isComplete())) && (!(queue.isEmpty()))) && (!(org.broadleafcommerce.core.search.index.SearchIndexProcessStateHolder.isFailed(processId)));
}