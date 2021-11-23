@java.lang.Override
public java.util.List<com.sinewang.kiimate.status.core.api.Assets> search(one.kii.summer.io.context.ReadContext context, com.sinewang.kiimate.status.core.api.QueryForm form) {
    one.kii.kiimate.status.core.dai.LoadAssetsDai.ClueGroup clue = one.kii.summer.beans.utils.ValueMapping.from(LoadAssetsDai.ClueGroup.class, form);
    clue.setGroup(form.getQuery());
    java.util.List<one.kii.kiimate.status.core.dai.LoadAssetsDai.Assets> assetsList = loadAssetsDai.queryAssets(clue);
    return one.kii.summer.beans.utils.ValueMapping.from(com.sinewang.kiimate.status.core.api.Assets.class, assetsList);
}