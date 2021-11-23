public boolean addResult(com.munch.exchange.model.core.optimization.ResultEntity result) {
    results.addFirst(result);
    java.util.Collections.sort(results);
    while ((results.size()) > (maxResult))
        results.removeLast();
    
    return result == (results.getFirst());
}