@java.lang.Override
public void removeTrain(java.util.LinkedList<Common.Wagon> train) {
    for (int i = 0; i < (this.getTracks().length); i++) {
        if ((this.getTracks()[i]) == train) {
            this.getTracks()[i] = null;
            break;
        }
    }
    Client.Visualizer.print();
}