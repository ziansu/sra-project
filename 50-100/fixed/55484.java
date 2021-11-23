@javax.annotation.PostConstruct
public void init() {
    userModel = edu.jhu.cvrg.waveform.utility.ResourceUtility.getCurrentUser();
    if ((userModel) != null) {
        if ((fileTree) == null) {
            fileTree = new edu.jhu.cvrg.waveform.model.LocalFileTree(userModel.getUserId(), "hea");
        }
        if ((algorithmList) == null) {
            algorithmList = new edu.jhu.cvrg.waveform.backing.AlgorithmList();
        }
        messages = new java.util.ArrayList<javax.faces.application.FacesMessage>();
    }
}