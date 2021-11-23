@java.lang.Override
public void loadComplete(java.util.List<com.MDGround.HaiLanPrint.models.Album> albums) {
    mAlbumsList.addAll(albums);
    getPhotoCountRequest();
    switch (com.MDGround.HaiLanPrint.application.MDGroundApplication.mChoosedProductType) {
        case Postcard :
        case MagazineAlbum :
        case ArtAlbum :
        case Calendar :
        case Poker :
        case Puzzle :
        case MagicCup :
        case LOMOCard :
            getPhotoTemplateListRequest();
            break;
        default :
            mMaxSelectImageNum = com.MDGround.HaiLanPrint.utils.SelectImageUtil.getMaxSelectImageNum(MDGroundApplication.mChoosedProductType);
            changeTips();
            break;
    }
}