@java.lang.Override
public void stepInit() throws weka.core.WekaException {
    if ((((m_encodedForecaster) == null) || (m_encodedForecaster.equals("-NONE-"))) && (((m_fileName) == null) || (weka.knowledgeflow.steps.TimeSeriesForecasting.isEmpty(m_fileName.toString())))) {
        throw new weka.core.WekaException("No forecaster specified!");
    }
    m_isReset = true;
    m_isStreaming = false;
    m_overlayData = null;
    m_bufferedPrimeData = null;
    m_streamingData = new weka.knowledgeflow.Data(weka.knowledgeflow.StepManager.CON_INSTANCE);
}