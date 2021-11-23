@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    worker.Worker worker = ((worker.Worker) (staffList.getSelectedValue()));
    if (worker == null)
        return ;
    
    if ((newWorkers) != null) {
        newWorkers.add(worker);
        deletedWorkers.remove(worker);
    }
    workerModel.addElement(worker);
    staffModel.removeElement(worker);
}