public void send(ccre.channel.FloatOutput output) {
    listeners.add(output);
    output.set(value);
}