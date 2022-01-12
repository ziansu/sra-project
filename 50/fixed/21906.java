public static synchronized acromusashi.stream.hook.AmLogServerAdapter getInstance() {
    if ((acromusashi.stream.hook.AmLogServerAdapter.instance) == null) {
        acromusashi.stream.hook.AmLogServerAdapter.instance = new acromusashi.stream.hook.AmLogServerAdapter();
    }
    return acromusashi.stream.hook.AmLogServerAdapter.instance;
}