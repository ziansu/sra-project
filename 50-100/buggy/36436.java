@java.lang.Override
public void addMatches(pl.edu.agh.ki.to2.patternmatcher.models.SearchPattern pattern, java.util.List<java.lang.String> sentences, java.lang.String url) {
    if (!(patternOccurrencesHashMap.containsKey(pattern))) {
        patternOccurrencesHashMap.put(pattern, new pl.edu.agh.ki.to2.plotter.model.Occurrences(url, sentences));
    }else
        if (patternOccurrencesHashMap.containsKey(pattern)) {
            pl.edu.agh.ki.to2.plotter.model.Occurrences occurrence = patternOccurrencesHashMap.get(pattern);
            occurrence.add(url, sentences);
        }
    
}