@java.lang.Override
public void save() {
    super.save();
    if ((this.records) != null) {
        for (com.ricogao.playpro.model.Record r : records) {
            r.associateEvent(this);
        }
    }
}