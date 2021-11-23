@java.lang.Override
public io.fabric8.kubernetes.api.model.KubernetesList create(io.fabric8.kubernetes.api.model.KubernetesList... items) {
    java.util.List<io.fabric8.kubernetes.api.model.HasMetadata> createdItems = new java.util.ArrayList<>();
    for (io.fabric8.kubernetes.api.model.KubernetesList i : items) {
        for (io.fabric8.kubernetes.api.model.HasMetadata r : i.getItems()) {
            io.fabric8.kubernetes.api.model.HasMetadata created = create(r);
            createdItems.add(created);
        }
    }
    io.fabric8.kubernetes.api.model.KubernetesList createdList = new io.fabric8.kubernetes.api.model.KubernetesList();
    createdList.setItems(createdItems);
    return createdList;
}