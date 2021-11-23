@java.lang.Override
public void init() {
    org.talend.datascience.common.inference.Analyzer<T> analyzer = pool.get();
    analyzer.init();
}