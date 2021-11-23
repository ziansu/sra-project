@java.lang.Override
public java.lang.String getStatistics() throws java.io.IOException {
    java.lang.StringBuilder stats = new java.lang.StringBuilder(256);
    stats.append((("The maximum depth of the webpage is: " + (edu.virginia.cs4240.webmetrics.modules.PageModule.maxTreeDepth(document))) + "\n"));
    stats.append(pageSize(url));
    return stats.toString();
}