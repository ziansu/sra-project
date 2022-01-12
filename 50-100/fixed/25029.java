public void evaluate(java.io.Writer writer, com.mitchellbosecke.pebble.template.EvaluationContext context) throws com.mitchellbosecke.pebble.error.PebbleException, java.io.IOException {
    if ((context.getExecutorService()) != null) {
        writer = new com.mitchellbosecke.pebble.utils.FutureWriter(writer);
    }
    buildContent(writer, context);
    writer.flush();
}