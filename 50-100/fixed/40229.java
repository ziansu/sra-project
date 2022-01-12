@org.springframework.web.bind.annotation.RequestMapping(value = "/list/{cid}")
@org.springframework.web.bind.annotation.ResponseBody
public cn.tf.taotao.common.utils.TaotaoResult getContentList(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long cid) {
    try {
        java.util.List<cn.tf.taotao.po.TbContent> list = contentService.getContentList(cid);
        return cn.tf.taotao.common.utils.TaotaoResult.ok(list);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return cn.tf.taotao.common.utils.TaotaoResult.build(500, cn.tf.taotao.common.utils.ExceptionUtil.getStackTrace(e));
    }
}