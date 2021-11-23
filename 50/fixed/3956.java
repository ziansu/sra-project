@java.lang.Override
public retrofit2.Call<java.util.List<moe.yukisora.yandere.modles.ImageData>> getCall(int page) {
    moe.yukisora.yandere.interfaces.YandereService service = moe.yukisora.yandere.core.ServiceGenerator.generate(moe.yukisora.yandere.interfaces.YandereService.class);
    return service.getPosts(page, tags);
}