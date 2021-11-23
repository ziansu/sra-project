@java.lang.Override
public void Save(ca.teameleven.com.teamelevenca.model.Item item) {
    if (DummyData.items.contains(item)) {
        DummyData.items.remove(item.getId());
    }
    DummyData.items.add(item.getId(), item);
}