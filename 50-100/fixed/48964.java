@java.lang.Override
public java.lang.Iterable<com.datatorrent.lib.util.KeyValPair<java.lang.String, org.apache.apex.malhar.stream.sample.complete.AutoComplete.CompletionCandidate>> f(org.apache.apex.malhar.stream.sample.complete.AutoComplete.CompletionCandidate input) {
    java.util.List<com.datatorrent.lib.util.KeyValPair<java.lang.String, org.apache.apex.malhar.stream.sample.complete.AutoComplete.CompletionCandidate>> result = new java.util.LinkedList<>();
    java.lang.String word = input.getValue();
    for (int i = minPrefix; i <= (java.lang.Math.min(word.length(), maxPrefix)); i++) {
        result.add(new com.datatorrent.lib.util.KeyValPair(input.getValue(), input));
    }
    return result;
}