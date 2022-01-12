private com.yubo.wechat.content.vo.MessageVO getRandomMessageInPool(com.yubo.wechat.content.service.textWorker.TextPool textPool) {
    java.util.List<com.yubo.wechat.content.vo.MessageVO> list = textPool.getTextContent();
    java.util.Random random = new java.util.Random();
    int idx = random.nextInt(list.size());
    com.yubo.wechat.content.vo.MessageVO findVO = list.get(idx);
    com.yubo.wechat.content.vo.MessageVO returnVO = new com.yubo.wechat.content.vo.MessageVO();
    returnVO.setContent(buildFuncShare(findVO.getSharePrefixList(), findVO.getContent()));
    return returnVO;
}