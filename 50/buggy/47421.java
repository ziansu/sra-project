@java.lang.Override
public intellimate.izou.output.OutputExtension[] registerOutputExtension() {
    intellimate.izou.output.OutputExtension[] outputExtensions = new intellimate.izou.output.OutputExtension[1];
    outputExtensions[0] = new leanderk.izou.weatheraddon.WeatherTTSOutputExtension(getPropertiesContainer(), getContext());
    return outputExtensions;
}