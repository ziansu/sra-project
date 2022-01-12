@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent e) {
    weka.experiment.Experiment exp = m_SetupPanel.getExperiment();
    if (exp != null) {
        exp.classFirst(m_ClassFirst);
        m_RunPanel.setExperiment(exp);
        m_TabbedPane.setEnabledAt(1, true);
    }
}