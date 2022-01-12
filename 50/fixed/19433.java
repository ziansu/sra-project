public int getTotalPage() {
    return (userMgr.getAllGoods(0, 0).size()) / (com.ian.onlinemall.controller.GoodsController.pageSize);
}