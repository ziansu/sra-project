public com.jackpf.pirover.Camera.Frame getIcon() {
    if ((frames.size()) > 0) {
        return frames.get(0);
    }
    try {
        frames.add(client.getFrame());
        return frames.get(0);
    } catch (com.jackpf.pirover.Camera.ClientException e) {
        e.printStackTrace();
        return null;
    }
}