@java.lang.Override
public com.example.igiagante.thegarden.core.repository.realm.modelRealm.ImageRealm copy(@android.support.annotation.NonNull
com.example.igiagante.thegarden.core.domain.entity.Image image, @android.support.annotation.NonNull
com.example.igiagante.thegarden.core.repository.realm.modelRealm.ImageRealm imageRealm) {
    imageRealm.setName(image.getName());
    imageRealm.setUrl(((com.example.igiagante.thegarden.core.repository.network.Settings.DOMAIN) + (image.getUrl())));
    imageRealm.setThumbnailUrl(((com.example.igiagante.thegarden.core.repository.network.Settings.DOMAIN) + (image.getThumbnailUrl())));
    imageRealm.setType(image.getType());
    imageRealm.setSize(image.getSize());
    imageRealm.setMain(image.isMain());
    return imageRealm;
}