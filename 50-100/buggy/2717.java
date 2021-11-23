public boolean will_buy(redis.clients.jedis.Jedis REDIS) {
    if (REDIS.exists(("stock:" + (itemStack.getType())))) {
        int stock = java.lang.Integer.valueOf(REDIS.get(("stock:" + (itemStack.getType()))));
        if (stock > (com.bitquest.bitquest.Trade.MAX_STOCK)) {
            return false;
        }else {
            return true;
        }
    }else {
        if ((this.has_stock) == true) {
            return true;
        }else {
            return false;
        }
    }
}