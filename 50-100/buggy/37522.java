public me.drton.flightplot.processors.PlotProcessor getProcessorInstance(me.drton.flightplot.ProcessorPreset processorPreset, double skipOut) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    java.lang.Class<? extends me.drton.flightplot.processors.PlotProcessor> procClass = processors.get(processorPreset.getProcessorType());
    if (procClass != null) {
        me.drton.flightplot.processors.PlotProcessor processor = procClass.newInstance();
        processor.setSkipOut(skipOut);
        processor.setParameters(processorPreset.getParameters());
        processor.init();
        processor.setColors(processorPreset.getColors());
        return processor;
    }else {
        return null;
    }
}