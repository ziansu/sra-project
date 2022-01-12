public java.lang.Object process(java.lang.Object data, io.mlh.objects.Metadata metadata) {
    java.lang.Object result;
    switch (metadata.getDisplayElementConfig().getType()) {
        case "pie_chart" :
            result = processPieChart(data, metadata);
            break;
        default :
            throw new java.lang.IllegalArgumentException("Unsupported chart type!");
    }
    return result;
}